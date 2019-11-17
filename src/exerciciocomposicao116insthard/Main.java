package exerciciocomposicao116insthard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Date moment = sdf.parse("21/06/2018 13:05:44");
		
		String title = "Traveling to New Zealand";
		
		String content = "I'm going to visit this wonderful country!";
		
		int likes = 12;
		
		Post p1 = new Post(moment, title, content, likes);
		p1.addComment(c1);	
		p1.addComment(c2);
		
		p1.toString();
	}

}
