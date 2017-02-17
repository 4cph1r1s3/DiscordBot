package commands;

import listeners.warframeAlertsCore;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class Alerts implements Command {

    public static String HELP = ":warning:  USAGE: ` ~alerts ` for posting full list of alerts / ` ~alerts filter ` for open GDocs-Doscument for filters";

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if (args.length > 0) {
            if (args[0].equals("filter")) {
                event.getTextChannel().sendMessage(
                        ":pencil: https://docs.google.com/document/d/13O2lZ_UemLDkCV8425XHOPSZ3aVoeYmV5cF_vLQAyEY/edit"
                ).queue();
            }
            else
                event.getTextChannel().sendMessage(help()).queue();
        }
        else
            event.getTextChannel().sendMessage(warframeAlertsCore.getAlertsAsMessage(warframeAlertsCore.getAlerts())).queue();

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return HELP;
    }
}