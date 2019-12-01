
import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<List<Integer>> getEmailThreads(List<String> emails){


    }

    public static void main(String[] args) {

        List<String> emails = new ArrayList<>();
        emails.add("sv@outlook.com, gfdpdyf@gmail.com, n");
        emails.add("wl@hackerrank.com, tk@outlook.com, m");
        emails.add("gfdpdyf@gmail.com, sv@outlook.com, t.xg---n");
        emails.add("sv@outlook.com, gfdpdyf@gmail.com, i---t.xg---n");
        emails.add("tk@outlook.com, wl@hackerrank.com, o---m");
        emails.add("tk@outlook.com, wl@hackerrank.com, w---o---m");
        emails.add("tk@outlook.com, wl@hackerrank.com, nv---w---o---m");
        emails.add("sv@outlook.com, gfdpdyf@gmail.com, cyhf---i---t.xg---n");

        List<List<Integer>> output = Result.getEmailThreads(emails);
        for (List<Integer> out : output)
            System.out.println(out);
    }
}