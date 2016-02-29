package demo.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InboxData {
	List<Mail> mails = new ArrayList<Mail>();

	public InboxData() {
		initData();
	}

	private void initData() {
		if (!mails.isEmpty())
			mails.clear();
		mails.add(new Mail(1, "zk Spreadsheet RC Released Check this out", "2010/10/17 20:37:12", ((int) ((int) ((Math.random() * 128) + 1))) ));
		mails.add(new Mail(2, "[zk 5 - Help] RE: SelectedItemConverter Question 3", "2010/10/17 18:31:12", ((int) ((Math.random() * 128) + 1)) ));
		mails.add(new Mail(3, "[zk 5 - Help] RE: SelectedItemConverter Question 2", "2010/10/17 17:30:12", ((int) ((Math.random() * 128) + 1)) ));
		mails.add(new Mail(4, "Times_Series Chart help", "2010/10/17 15:26:37", ((int) ((Math.random() * 128) + 1)) ));
		mails.add(new Mail(5, "RE: Times_Series Chart help", "2010/10/17 14:22:37", ((int) ((Math.random() * 128) + 1)) ));
		mails.add(new Mail(6, "RE: Times_Series Chart help(Updated)", "2010/10/17 13:26:37", ((int) ((Math.random() * 128) + 1)) ));
		mails.add(new Mail(7, "[zk 5 - General] Grid Rendering problem", "2010/10/17 10:41:33", ((int) ((Math.random() * 128) + 1)) ));
		mails.add(new Mail(8, "[zk 5 - Help] RE: SelectedItemConverter Question", "2010/10/17 10:14:27", ((int) ((Math.random() * 128) + 1)) ));
		mails.add(new Mail(9, "[Personal] RE: requirement of new project", "2010/10/16 13:34:37", ((int) ((Math.random() * 128) + 1)) ));		
		mails.add(new Mail(10, "[zk 3 - Feature] Client programming Question", "2010/10/15 04:31:12", ((int) ((Math.random() * 128) + 1)) ));		
		mails.add(new Mail(11, "[zk 5 - Feature] Hlayout/Vlayout Usage", "2010/10/15 04:31:12", ((int) ((Math.random() * 128) + 1)) ));
		mails.add(new Mail(12, "RE: Times_Series Chart help(Updated)", "2010/10/15 03:26:37", ((int) ((Math.random() * 128) + 1)) ));
		mails.add(new Mail(13, "[zk 3 - Feature] JQuery support", "2010/10/14 04:31:12", ((int) ((Math.random() * 128) + 1)) ));
		mails.add(new Mail(14, "[zk 5 - Help] RE: Times_Series Chart help", "2010/10/14 02:43:34", ((int) ((Math.random() * 128) + 1)) ));
		mails.add(new Mail(15, "[Personal] requirement of new project", "2010/10/14 02:44:35", ((int) ((Math.random() * 128) + 1)) ));
		mails.add(new Mail(16, "[zk 5 - Help] RE: SelectedItemConverter Question", "2010/10/13 02:14:27", ((int) ((Math.random() * 128) + 1)) ));		
	}

	public void revertDeletedMails() {
		initData();
	}

	public void deleteAllMails() {
		mails.clear();
	}

	public void addMails(Collection<Mail> c) {
		mails.addAll(c);
	}

	public List<Mail> getMails() {
		return mails;
	}

	public void deleteMail(Mail m) {
		mails.remove(m);
	}
	
	public int getSize(){
		return mails.size();
	}
}
