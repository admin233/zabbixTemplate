package java;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ReadProperties {
    private static Properties staticProperties;
    private static final String FILEENCODE = "UTF-8" ;

    public static String readTextFile(String filename) throws Exception{

        String result = null;
        byte [] bytemp = new byte[1024];
        byte [] readbyte = new byte[0];
        BufferedInputStream bis = new BufferedInputStream(ReadProperties.class.getClassLoader().getResourceAsStream(filename));
        while ( bis.read(bytemp)!= -1){
            readbyte = addAll(readbyte,bytemp);
            bytemp = new byte[1024];
        }
        if(readbyte.length>0){
            result = new String(readbyte,0,readbyte.length,FILEENCODE);
        }
        bis.close();
        return result;

    }

    public Properties loadProperties(String resource) {
        InputStream inputStream = null;
        BufferedReader bf;
        try {
            inputStream = this.getClass().getClassLoader().getResourceAsStream(resource);
            bf = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            Properties props = new Properties();
            props.load(bf);
            return props;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

    public static String get(String propertyName){
        if(staticProperties == null)
        {staticProperties = new ReadProperties().loadProperties("config.properties");}
        return staticProperties.getProperty(propertyName);
    }

    public static byte[] addAll(byte[] array1, byte... array2) {
        if (array1 == null)
            return clone(array2);
        if (array2 == null) {
            return clone(array1);
        }
        byte[] joinedArray = new byte[array1.length + array2.length];
        System.arraycopy(array1, 0, joinedArray, 0, array1.length);
        System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return joinedArray;
    }

    public static byte[] clone(byte[] array) {
        if (array == null) {
            return null;
        }
        return (byte[])array.clone();
    }

}
