package exerciciocomposicao116;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner s = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

		System.out.println("Digite quantos post serão criados: ");

		int n = s.nextInt();

		for (int i = 1; i < (n + 1); i++) {

			System.out.println("Digite a data do post: #" + i);
			s.nextLine();
			Date moment = sdf.parse(s.nextLine());
			System.out.println("Digite o título do  post: #" + i);
			String title = s.nextLine();
			System.out.println("Digite o conteúdo do post: #" + i);
			String content = s.nextLine();
			System.out.println("Digite o número de likes: #" + i);
			int likes = s.nextInt();
			System.out.println("Digite quantos comentários o post #" + i + "tem: ");
			int nComments = s.nextInt();

			Post post = new Post(moment, title, content, likes);

			for (int j = 1; j < (nComments + 1); j++) {

				System.out.println("Digite o comentário: ");
				String text = s.nextLine();
				Comment a = new Comment(text);
				post.addComment(a);
			}

		}
		
		
		s.close();

	}

}
