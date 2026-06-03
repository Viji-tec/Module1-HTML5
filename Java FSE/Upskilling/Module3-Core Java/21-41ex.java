//ex21
/*
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    static void checkAge(int age) throws InvalidAgeException {
        if(age < 18)
            throw new InvalidAgeException("Age must be 18 or above");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}*/
//ex22
/*
import java.io.FileWriter;

public class FileWriting {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello Java");
            writer.close();

            System.out.println("File Written Successfully");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}*/
//ex23
/*
import java.io.File;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {

        try {
            File file = new File("output.txt");
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
} */
//ex24
/*
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Shalini");
        students.add("Rahul");
        students.add("Kumar");

        System.out.println(students);
    }
} */

//ex25
/*
*import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(101,"Shalini");
        map.put(102,"Rahul");

        System.out.println(map.get(101));
    }
}*/
//ex26
/*
class MyThread extends Thread {

    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Thread Running");
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}*/
//ex27
/*
import java.util.*;

public class LambdaExpressions {
    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Java","Python","C");

        Collections.sort(list,
                (a,b) -> a.compareTo(b));

        System.out.println(list);
    }
} */
//ex28
/*
import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {

        List<Integer> nums =
                Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> even =
                nums.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());

        System.out.println(even);
    }
} */
//ex29
/*
record Person(String name,int age){}

public class RecordExample {
    public static void main(String[] args) {

        Person p1 = new Person("Shalini",20);
        Person p2 = new Person("Rahul",25);

        System.out.println(p1);
        System.out.println(p2);
    }
} */
//ex30
/*
public class PatternMatchingSwitch {

    static void check(Object obj) {

        if(obj instanceof String s)
            System.out.println("String: " + s);

        else if(obj instanceof Integer i)
            System.out.println("Integer: " + i);

        else if(obj instanceof Double d)
            System.out.println("Double: " + d);

        else
            System.out.println("Unknown Type");
    }

    public static void main(String[] args) {

        check("Java");
        check(100);
        check(99.5);
    }
}*/
//ex31
/*
import java.sql.*;

public class BasicJDBCConnection {
    public static void main(String[] args) {

        try {
            Connection con =
                DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "password");

            Statement st = con.createStatement();

            ResultSet rs =
                st.executeQuery("SELECT * FROM students");

            while(rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " +
                    rs.getString(2));
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}*/
//ex32
/*
import java.sql.*;

public class JDBCInsertUpdate {
    public static void main(String[] args) {

        try {
            Connection con =
                DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "password");

            PreparedStatement ps =
                con.prepareStatement(
                    "INSERT INTO students VALUES(?,?)");

            ps.setInt(1,101);
            ps.setString(2,"Shalini");

            ps.executeUpdate();

            System.out.println("Record Inserted");

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}*/
//ex33
/*
import java.sql.*;

public class JDBCTransactionHandling {
    public static void main(String[] args) {

        try {

            Connection con =
                DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test",
                    "root",
                    "password");

            con.setAutoCommit(false);

            Statement st = con.createStatement();

            st.executeUpdate(
                "UPDATE accounts SET balance=balance-100 WHERE id=1");

            st.executeUpdate(
                "UPDATE accounts SET balance=balance+100 WHERE id=2");

            con.commit();

            System.out.println("Transaction Successful");

        } catch(Exception e) {
            System.out.println(e);
        }
    }
} */
//ex34
/*
public class JavaModulesDemo {
    public static void main(String[] args) {
        System.out.println("Java Modules Example");
    }
} */

//ex35
/*
import java.net.*;
import java.io.*;

public class TCPClientServerChat {
    public static void main(String[] args) {
        System.out.println("TCP Client Server Chat Example");
    }
} */
//ex36
/*
import java.net.http.*;
import java.net.URI;

public class HTTPClientAPI {
    public static void main(String[] args) throws Exception {

        HttpClient client =
                HttpClient.newHttpClient();

        HttpRequest request =
                HttpRequest.newBuilder()
                .uri(URI.create(
                    "https://api.github.com"))
                .build();

        HttpResponse<String> response =
                client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
    }
}
 */
//ex37
/*
public class JavapBytecodeDemo {
    public static void main(String[] args) {
        System.out.println("Compile and run:");
        System.out.println("javap -c JavapBytecodeDemo");
    }
}
 */
//ex38
/*
public class ClassFileDecompileDemo {
    public static void main(String[] args) {
        System.out.println("Use JD-GUI or CFR Decompiler");
    }
}
 */
//ex39
/*
import java.lang.reflect.Method;

public class ReflectionDemo {

    public void display() {
        System.out.println("Reflection Example");
    }

    public static void main(String[] args) throws Exception {

        Class<?> cls =
                Class.forName("ReflectionDemo");

        Method[] methods =
                cls.getDeclaredMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
        }
    }
} */
//ex40
/*
public class VirtualThreadsDemo {
    public static void main(String[] args) {

        Thread.startVirtualThread(() ->
            System.out.println("Virtual Thread Running"));

        System.out.println("Main Thread");
    }
} */
//ex41
/*
import java.util.concurrent.*;

public class ExecutorServiceCallable {
    public static void main(String[] args)
            throws Exception {

        ExecutorService service =
                Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> 10 + 20;

        Future<Integer> result =
                service.submit(task);

        System.out.println(result.get());

        service.shutdown();
    }
} */