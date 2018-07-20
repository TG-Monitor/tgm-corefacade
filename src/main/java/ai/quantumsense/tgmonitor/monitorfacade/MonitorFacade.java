package ai.quantumsense.tgmonitor.monitorfacade;

import ai.quantumsense.tgmonitor.entities.Emails;
import ai.quantumsense.tgmonitor.entities.Patterns;
import ai.quantumsense.tgmonitor.entities.Peers;
import ai.quantumsense.tgmonitor.monitor.LoginCodePrompt;
import ai.quantumsense.tgmonitor.monitor.Monitor;

import java.util.Set;

public interface MonitorFacade extends Monitor, Peers, Patterns, Emails {

    @Override
    void login(String phoneNumber);
    @Override
    void logout();
    @Override
    boolean isLoggedIn();
    @Override
    void start();
    @Override
    void stop();
    @Override
    boolean isRunning();
    @Override
    String getPhoneNumber();

    @Override
    Set<String> getPeers();
    @Override
    void setPeers(Set<String> peers);
    @Override
    void addPeer(String peer);
    @Override
    void addPeers(Set<String> peers);
    @Override
    void removePeer(String peer);
    @Override
    void removePeers(Set<String> peers);

    @Override
    Set<String> getPatterns();
    @Override
    void setPatterns(Set<String> patterns);
    @Override
    void addPattern(String pattern);
    @Override
    void addPatterns(Set<String> patterns);
    @Override
    void removePattern(String pattern);
    @Override
    void removePatterns(Set<String> patterns);

    @Override
    Set<String> getEmails();
    @Override
    void setEmails(Set<String> emails);
    @Override
    void addEmail(String email);
    @Override
    void addEmails(Set<String> emails);
    @Override
    void removeEmail(String email);
    @Override
    void removeEmails(Set<String> emails);

    void registerLoginCodePrompt(LoginCodePromptFacade loginCodePrompt);

    interface LoginCodePromptFacade extends LoginCodePrompt {}
}
