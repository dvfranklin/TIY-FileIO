import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookTracker {
    public static void main(String[] args){


            try {
                Gson gson = new GsonBuilder().create();

                File bookFile = new File("bookfile.json");
                if(!bookFile.exists()){
                    bookFile.createNewFile();
                }

                Scanner fileInput = new Scanner(bookFile);
                fileInput.useDelimiter("\\Z");
                Book book = new Book();

                if (fileInput.hasNext()) {
                    String contents = fileInput.next();
                    book = gson.fromJson(contents, Book.class);
                    System.out.println(book);
                } else {
                    System.out.println("No book found.");
                }

                Scanner userInput = new Scanner(System.in);
                FileWriter fw = new FileWriter(bookFile);


                System.out.println("Enter a book title: ");
                book.setTitle(userInput.nextLine());

                System.out.println("Enter the book's author:");
                book.setAuthor(userInput.nextLine());

                System.out.println("What genre of book is this?");
                book.setGenre(userInput.nextLine());

                System.out.println("What is the book's ISBN number?");
                book.setIsbn(userInput.nextLine());

                System.out.println("How much does the book cost?");
                book.setPrice(userInput.nextLine());

                String json = gson.toJson(book);
                fw.write(json);
                fw.close();
            } catch (FileNotFoundException e) {
                System.out.println("Could not find the book tracker file.");
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("There was an error reading or writing from the file.");
                e.printStackTrace();
            }
    }
}
