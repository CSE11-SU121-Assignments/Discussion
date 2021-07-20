import java.nio.file.Files;

/*
read file

*/
import java.nio.file.*;
import java.io.IOException;
import java.util.Arrays;



class FileHelper {

    static String[] getlines(String path){
        try {
            return Files.readAllLines(Paths.get(path)).toArray(String[]::new);//lambda function - returns new String[size]
        }
        catch(IOException e){
            // System.err.println("Error reading file " + path +": " +e);
            return new String[]{"Error reading file " + path +": " +e}; 
        }

    }
}

class read{

    public static void main (String [] args){
        if(args.length < 1){
            System.out.println("Please provide path");
        }
        else {
            System.out.println("Args: " + Arrays.toString(args));
            String filepath = args[0];
            String query = args[1];
            String transform = args[2];

            
            a query is a requirement


            for line in file_lines:
                if matchesAll(queries, line):
                    print out line being transformed (if it exists)
            


            String[] fileLines = FileHelper.getlines(filepath);

            
            // queries are separated by &
            String[] queries = query.split("&");
            System.out.println("Queries: " + Arrays.toString(queries));
            /*
            for (String query : queries){
                Query q = readQuery(query);
            }*/
            
            // transformations are separated by &
            String[] transformations = transform.split("&");
            System.out.println("Transform: " + Arrays.toString(transformations));
            
            
            //System.out.println(Arrays.toString(fileLines));
            int i = 0;
            for(String line: fileLines){
                System.out.println("line: " +  i + "" + line);
            }
            
            
            
        }
    }
}

/*
boolean matchesAll(Query[] qs, String s)
    for (query q : qs)
        if !q.matches(s)
            return False

    return True
*/