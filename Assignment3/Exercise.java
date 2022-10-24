public class Exercise {

    public static void main(String[] args) throws Exception {
 
 

        char [][] mdArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};

 
        // PATTERN 1  
 
            System.out.println("1. PATTERN 1");  
 
               for (int rows = 0; rows < mdArray.length; rows++){
 
                              System.out.println("");
 
                  for (int column = 0; column < 3 ; column++){
 
                        if (rows %2 != 0 ){
 
                        System.out.print(mdArray[rows][column]);
                    }
                  }
               }
 
               System.out.println("");
 
    // PATTERN 2
 
        System.out.println("2. PATTERN 2");
 
                 for (int rows = 0; rows < mdArray.length; rows++){
 
                              System.out.println("");
 
                    for (int column = 0; column < 3 ; column++){
 
                       if (rows %2 == 0 ){
 
                     System.out.print(mdArray[rows][column]);

                  }
              }
            }
 
            System.out.println("");
 
    // PATTERN 3
 
        System.out.println("3. PATTERN 3");
 
            for (int row = 0; row < mdArray.length; row++) {
              System.out.println("");

             for (int column = 0; column < 3; column++) {
            if (row == 0 || row == 3){
                System.out.print(mdArray[row][column]);

            }
                if (row == 1 || row == 2){
                if (column == 0 || column == 2){
                System.out.print(" ");
 
                    } else {
 
                        System.out.print(mdArray[row][column]);
 
                    }
                }
            }
        }
 
                 System.out.println("");
 
    // PATTERN 4
 
       System.out.println("4. PATTERN 4");
 
       System.out.println("");
 
    for (int row = 0; row < mdArray.length; row++) {

        System.out.println("");

        for (int column = 0; column < 3; column++) {
 
            if (row == 1 || row == 3){
                System.out.print(mdArray[row][column]);
            }
 
                if (row == 0 || row == 2){
 
                    if (column == 0 || column == 2){
                        System.out.print(" ");
                        
                    } else {
 
 
                        System.out.print(mdArray[row][column]);
 
 
                    }
 
 
                }
 
 
            }
 
 
        }
 
        System.out.println("");
 
    // PATTERN 5
 
      System.out.println("5. PATTERN 5");
 

        for (int rows = 0; rows < 4; rows++) {
        
        
        System.out.println("");
        
        
        int [][] two  = {{1,1,1},{1,1,1},{1,1,1}, {1, 1, 1}};
        
            int sum=0;
        
        for (int row = 0; rows <4; rows++){
        
                    for (int column = 0; column <3; column++){
        
 
 
 
                 sum += two[row][column];        
 
 
 
 
                }
 
             }
 
    System.out.println("THE SUM IS: " + sum);
 
        }
 
    }
 
}
