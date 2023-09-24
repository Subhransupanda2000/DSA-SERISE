
    import java.io.*;

import java.util.*;

    class main
    {

        public static void main(String[] args) throws Exception //MAIN METHOD
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //IT IS A BUFFER EXPRESSION
            int n = Integer.parseInt(br.readLine());//IT READS THE LINE FROM CONSOLE
            CustomStack st = new CustomStack(n); //IT CREATE A OBJECT CALLED ST

            String str = br.readLine();IT WILL TAKE INPUT AS A STRING
            while (str.equals("quit") == false)  //WHILE LOOP WILL RUN UNTILL QUITE WILL BECOME FALSE
            {  if (str.startsWith("push")) { //AS ??
                int val = Integer.parseInt(str.split(" ")[1]); //AS ??
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            } else if (str.startsWith("display")) {
                st.display();
            }
                str = br.readLine();
            }
        }
    }
}
