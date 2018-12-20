
package hangman.model;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import hangman.MainApp;
import hangman.util.Alphabet;

public class Key extends Button {

	char identity;
	
	public Key() {

		super();

	}

	public Key(final char letter) {

		super();
		this.identity = letter;
		String s = Character.toString(letter);
			
		this.setText(s);
		this.setPrefWidth(35);
		this.setId(s);

		
		this.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				setKeyDisable(Alphabet.getNummber(letter));
			};
		});
		
	}
	
	public void setKeyDisable(int i) {
		
		if(MainApp.controller1.word.length()!=0 && !MainApp.button.get(i).isDisable()) {
			MainApp.button.get(i).setDisable(true);
			MainApp.controller1.testNewLetter(Alphabet.getLetter(i));
			}
	}
	
}