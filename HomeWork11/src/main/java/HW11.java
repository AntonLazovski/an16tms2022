public class HW11 {
    public static void main(String[] args) {
        String str1 = "cook";
        String str2 = "Static";
        String str3 = "Notebook";
        String subStr1 = str1.substring(1, 3);
        String subStr2 = str2.substring(2, 4);
        String subStr3 = str3.substring(3, 5);
        System.out.println(subStr1);
        System.out.println(subStr2);
        System.out.println(subStr3);
        String replStr1 = str1.replace('k', 'c');
        System.out.println(replStr1);

        System.out.println();

        String str4 = "kazaki";
        String str5 = "prosmotret";
        String str6 = "divancik";
        String str7 = "malarnuy";
        String subStr4 = str4.substring(2, 4);
        String subStr5 = str5.substring(4, 6);
        String subStr6 = str6.substring(3, 5);
        String subStr7 = str7.substring(3, 5);
        System.out.println(subStr4);
        System.out.println(subStr5);
        System.out.println(subStr6);
        System.out.println(subStr7);

    }
}
