// sen bajgai
// P02
// nigerian prince email first assignment
// 09/17/2025

package edu.bhscs;

public class NigerianPrinceEmail {
  private String sender;
  private String subject;
  private String body;

  public NigerianPrinceEmail() {
    this.sender = "prince.nigeria@royalmail.com";
    this.subject = "Urgent: Assistance Needed";
    this.body =
        "Dear Friend,\n\nI am Prince Abacha from Nigeria. I need your help to transfer $10,000,000 out of my country. Please send your bank details.\n\nYours sincerely,\nPrince Abacha";
  }



  public String getSender() {
    return sender;
  }

  public String getSubject() {
    return subject;
  }

  public String getBody() {
    return body;
  }

  public void printEmail() {
    System.out.println("From: " + sender);
    System.out.println("Subject: " + subject);
    System.out.println("Body: " + body);
  }
}
