
	void decode(String s, Node root) {
            StringBuilder sb = new StringBuilder();
            Node c = root;
            for (int i = 0; i < s.length(); i++) {
               c = s.charAt(i) == '1' ? c.right : c.left;
               if (c.left == null && c.right == null) {
                  sb.append(c.data);
                   c = root;
               }
           }
         System.out.print(sb);    
    }