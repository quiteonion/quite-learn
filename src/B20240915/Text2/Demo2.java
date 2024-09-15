package B20240915.Text2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/B20240915/Text2/file1");
        FileOutputStream fos = new FileOutputStream("src/B20240915/Text2/file2");

        int l;
        StringBuilder sb = new StringBuilder();
        while ((l = fis.read()) != -1) {
            sb.append(l);
        }
        String string = sb.toString();
        String[] split = string.split("45");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            Integer i1 = Integer.parseInt(split[i]);
            arrayList.add(i1);
        }
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            fos.write(arrayList.get(i));
            if (i != arrayList.size()-1)
                fos.write('-');
        }

        fis.close();
        fos.close();
    }

}
