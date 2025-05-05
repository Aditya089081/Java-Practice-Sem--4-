// String(immutable) Vs String Buffer(Thread - safe) Vs String Builder(Performance)
// (Heap,String Pool) Vs (Stack , heap) Vs (Heap)


// public class Test {
//     public static void main(String[] args) {
//     StringBuilder sb =
//     sb . append ("Hetto");
//     sb . insert( offset: 1,
//     sb . replace( start: 1,
//     sb.detete(l, 4);
//     sb.reverse();
//     sb.charAt(0);
//     new
//     str.
//     end:
//     1
//     StringBuilder() ;
//     // Append text
//     • "Java");
//     // Insert a•
//     3, str: "World") ;
//     // Repla
//     Delete range
//     Reverse string
//     Get character at i
//     Get length
//     Get substring
public class strings {
    public static StringBuffer info1(StringBuffer s){
        s.append(" Entry").delete(1,4).insert(1,"Java");
        return s;
    }
    public static void main(String [] arg){
        String Name = "Aditya Tiwari";
        String Name1 = Name.concat(" nokhepur");   // it return reference of the string object
        System.out.println(Name1);

        StringBuffer sb = new StringBuffer("Aditya");
        sb.append(" Tiwari").append(" Nokhepur");
        System.out.println(sb);
        String a = sb.toString();
        String c = sb.toString();
        System.out.println(c.equals(a));
        System.out.println(a);
        StringBuffer b = info1(sb);
        System.out.println(b);
    }
}
