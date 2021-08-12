package application;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.JournalDAO;
import dao.JournalTagsDAO;
import dao.TagDAO;
//import dao.RemindersDAO;
import dao.UserDAO;

public class Menu {

	private JournalDAO journalDao = new JournalDAO();
	private JournalTagsDAO jouralTagsDAO = new JournalTagsDAO();
	private TagDAO tagDAO = new TagDAO();
	//private RemindersDAO remindersDAO = new RemindersDAO();
	private UserDAO userDAO = new UserDAO();
	private Scanner scanner = new Scanner(System.in);
	
private List<String> loginOptions = Arrays.asList(
		"Display all Users", 
		"Select a User", 
		"Create a User", 
		"Delete a User"
		);

//
private List<String> selectUserOptions = Arrays.asList(
		"Which user are you?"
		//list all users to be selected 
		); //maybe part of the select options 

//			Once user is selected
private List<String> userOptions = Arrays.asList(
		"Make a journal entry",
		"Update email address"
		);

//When "make a journal" is selected
private List<String> journalOptions = Arrays.asList(
		"Create a Journal Entry",  
		"Display all Journal Entries",
		"Update a Journal Entry",
		"Delete a Journal Entry",
		"See all possible Journal Tags"
		);

//When they ask to update a journal entry 
private List<String> journalUpdateOptions = Arrays.asList(
		"Update a Journal Entry by Title",  
		"Update a Journal Entry by Content"
		);

//When "See all possible Journal Tags" is selected 

private List<String> tagOptions = Arrays.asList(
		"Display all tags",
		"Search for tag via name",
		"Search for tag via tag id",
		"Create new tag",
		"Update tag",
		"Delete tag"
		);


public void start() {
		String selection = "";
			
			do {
				printLogInMenu();
				selection = scanner.nextLine();
				
				try {
					if (selection.equals("1")) {
						displayAllUsers();
					} else if (selection.equals("2")) {
						selectUser();
					} else if (selection.equals("3")) {
						createUser();
					} else if (selection.equals("4")) {
						deleteUser();
					}
					
				} catch (SQLException e){
					e.printStackTrace();
				}
				
				System.out.println("Press enter to continue");
				scanner.nextLine();
			} while (!selection.equals("-1"));
			System.out.println("Thanks for stopping by!");
} 

private void printLogInMenu() {
	System.out.println("Select an Option: \n ------------------------------------");
	for (int i = 0; i < loginOptions.size(); i++) {
		System.out.println(i + 1 + ") " + loginOptions.get(i));
	}
	}
}
