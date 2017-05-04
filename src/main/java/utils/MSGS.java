package utils;

import net.dv8tion.jda.core.EmbedBuilder;

import java.awt.*;

/**
 * Created by zekro on 04.05.2017 / 12:09
 * DiscordBot/utils
 * © zekro 2017
 */

public class MSGS {

    public static EmbedBuilder success = new EmbedBuilder().setColor(Color.green);
    public static EmbedBuilder error = new EmbedBuilder().setColor(Color.red).setDescription(":warning:  **Can not run command because an error occurred.**");

}
