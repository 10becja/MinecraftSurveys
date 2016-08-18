package me.becja10.MinecraftSurveys.utils;

import org.bukkit.ChatColor;

public class Messages {
		
	private static Message noPermission = new Message(ChatColor.DARK_RED + "You do not have permission for this command");
	private static Message playerNotFound = new Message(ChatColor.DARK_RED + "Could not find player by that name");	
	private static Message playersOnly = new Message("This command must be run by a player");

	
	public static String noPermission(){ return noPermission.getMsg();}
	public static String playerNotFound(){return playerNotFound.getMsg();}
	public static String playersOnly(){ return playersOnly.getMsg();}

	
	
	private static class Message{
		String msg;
		
		Message(String str)
		{
			msg = str;
		}
		
		String format(String... args){
			String ret = msg;
			for(int i = 0; i < args.length; i++)
			{
				ret = ret.replace("{" + i + "}", args[i]);
			}
			return ret;
		}
		
		String getMsg()
		{
			return msg;
		}
	}

}