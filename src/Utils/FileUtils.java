package Utils;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileUtils {

    public static <T> T[] getContentLines(URI path, Class<T> clazz){
        try {
        List<String> file  = Files.readAllLines(Paths.get(path));
        T[] result = (T[]) new Object[file.size()];
            for (int line = 0; line < result.length; line++) {
                result[line] = getContentLinesByType(file.get(line),clazz);
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    public static <T> List<T> getListContent(URI path, Class<T> clazz){
        T[] data = getContentLines(path,clazz);
        return Arrays.asList(data);

    }

    private static <T> T getContentLinesByType(String line, Class<T> clazz){
        if(clazz == int.class){
            return (T)(Object)Integer.parseInt(line);
        }
        if(clazz == float.class){
            return (T)(Object)Integer.parseInt(line);
        }
        if(clazz == char.class){
            return (T)(Object)Integer.parseInt(line);
        }
        if(clazz == double.class){
            return (T)(Object)Integer.parseInt(line);
        }
        if(clazz == Integer.class){
            return (T) Integer.valueOf(Integer.parseInt(line));
        }
        if(clazz == String.class){
            return (T)(Object)String.valueOf(line);
        }
        if(clazz == Float.class){
            return (T)(Object)Integer.parseInt(line);
        }
        if(clazz == boolean.class){
            return (T)(Object)Integer.parseInt(line);
        }
        if(clazz == Double.class){
            return (T)(Object)Integer.parseInt(line);
        }
        return null;
    }


}
