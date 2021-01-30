package src.kuznichenko;

    import java.util.Iterator;

    public class Main {
        public Main() {
        }

        public static void main(String[] args) {
            Report report = new Report();
            Row row1 = new Row();
            row1.getCells().add("a");
            row1.getCells().add("b");
            row1.getCells().add("c");
            report.setRows(row1.getCells());
            Row row2 = new Row();
            row2.getCells().add("d");
            row2.getCells().add("e");
            row2.getCells().add("f");
            report.setRows(row2.getCells());
            returnReport(row1);
            returnReport(row2);
        }

        static void returnReport(Row roww) {
            Row report = new Row();
            int i = 0;

            for(Iterator var3 = roww.getCells().iterator(); var3.hasNext(); ++i) {
                String o = (String)var3.next();
                o = (String)roww.getCells().get(i);
                report.getCells().add(o);
            }

            System.out.println(report.getCells());
        }
    }


