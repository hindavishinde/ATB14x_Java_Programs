package ex_18_StringBuffer_StringBuilder;

public class Lab102_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Sachin");
        stringBuffer.append("AS"); // Mutable means content change possible
        // append Add
        System.out.println(stringBuffer); // SachinMS

        String s1 = "HIndavi";
        s1 = s1 + "HIndavi"; // no string replacement
        System.out.println(s1); // SAchinSAchinMS

    }
}
