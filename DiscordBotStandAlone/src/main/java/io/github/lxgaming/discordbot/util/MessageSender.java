package io.github.lxgaming.discordbot.util;

import io.github.lxgaming.discordbot.DiscordBot;

public class MessageSender {
	
	private static String botTextChannel = DiscordBot.config.getString("BotChannel");
	
	public static void sendMessage(String message) {
		try {
			DiscordBot.jda.getTextChannelById(botTextChannel).sendMessage(message);
		} catch (Exception ex) {
			System.out.println("Unable to send message!");
			System.out.println("Make sure 'DiscordBot.TextChannels.Bot' Is using an ID and not a name!");
			System.out.println("List of available TextChannels " + DiscordBot.jda.getTextChannels());
		}
		return;
	}
}