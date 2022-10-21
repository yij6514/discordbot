package testingbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Testingbot {
	public static JDA jda;
	
	public static void main(String argv[]) {
		jda = JDABuilder.createDefault("MTAzMjcyMTQ0NDc3MTIxNzQ2OA.G9I-AN.X_bDmUDRp743mr_yk9Abz9ta5QlTJ8Dmc__Tps").build();
	}
}
