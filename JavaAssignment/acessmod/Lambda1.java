package acessmod;
@FunctionalInterface
interface AuthorMessage {
    String authorWinningPrice(String authorName);
}

public class Lambda1 {

    public static void main(String[] args) {
    	 String authorName = "Nivetha";
   
        AuthorMessage messageGenerator = (author) -> author + " has won the prestigious award!";
       
        String message = messageGenerator.authorWinningPrice(authorName);

       
        System.out.println(message);
    }
}


