class Main {
  public static void main(String[] args) {
    char choice='C'; //change this to a scanner
    String favStore=""; //this will store the favorite store
    System.out.println("What's your favorite Grocery Store? (Keep in mind it's case sensitive");
    System.out.println("A. Remark \n B. SuperStore \n C. Sobeys \n D. Other");

    if (choice=='A'){ 
      favStore = "Remark";
    }
    else if (choice=='B'){
      favStore = "Super Store";
    }
    else if (choice=='C'){ // Because choice is C this code will run
     favStore = "Sobeys";;
    }
    else if (choice=='D'){
      favStore = "Other";
    }
    else{
      System.out.println("Error you have entered an invalid character");
      favStore="invalid selection";
    }
      System.out.println("You favorite store is " + favStore);
  }
}