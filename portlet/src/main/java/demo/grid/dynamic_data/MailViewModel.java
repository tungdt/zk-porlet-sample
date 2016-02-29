package demo.grid.dynamic_data;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import demo.data.InboxData;
import demo.data.Mail;

public class MailViewModel {
	
	InboxData mailData = new InboxData();
	
	public InboxData getMailData() {
		return mailData;
	}

	@Command
	@NotifyChange("mailData")
	public void revertMail() {
		mailData.revertDeletedMails();
	}
	
	@Command
	@NotifyChange("mailData")
	public void deleteAllMail() {
		mailData.deleteAllMails();
	}
	
	@Command
	@NotifyChange("mailData")
	public void removeMail(@BindingParam("mail") Mail myMail) {
		mailData.deleteMail(myMail);
	}
}
