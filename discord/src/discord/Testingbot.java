package discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Testingbot
{
	static JDA jda;
	static String TOKEN = "MTAzMjcyMTQ0NDc3MTIxNzQ2OA.Gd1r2A.CIhY1WclKI4-qo3kX9VvaoPkScAp1BbbTlRx-I";
	static String prefix = "!";
	
	public static void main(String[] arguments) throws Exception
	{
	    jda = JDABuilder.createDefault(TOKEN).enableIntents(GatewayIntent.MESSAGE_CONTENT).build();
	    
	    jda.addEventListener(new MyListener());
	}
}