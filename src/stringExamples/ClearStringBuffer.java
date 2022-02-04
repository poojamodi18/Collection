package stringExamples;
//clear stringBuffer using delete()
public class ClearStringBuffer {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append("string");
        strBuffer.append(" buffer");
        strBuffer.append(" delete");
        System.out.println("String buffer: "+strBuffer);
//        strBuffer.delete(0,strBuffer.length());
        strBuffer.setLength(0);
        System.out.println("String buffer after delete: "+strBuffer);
    }
}
