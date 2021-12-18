 public class check4 {
      static  boolean[] array()
        {
            boolean arr[] = new boolean[3];
            arr[0] = true;
            arr[1] = false;
            arr[2] = true;
            return arr;
        }
        public static void main(String args[])
        {

          boolean a[] = array();
            int i;
            for(i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
            }
        }


    }


