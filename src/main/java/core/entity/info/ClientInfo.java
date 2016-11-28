package core.entity.info;

import core.entity.state.ClientState;

import java.util.Collections;
import java.util.Set;

public class ClientInfo {
    private final String login;
    private final String first_name;
    private final String last_name;
    private final String second_name;
    private final String phone_number;
    private final String email;
    private final ClientState clientState;

    public ClientInfo(String login, String first_name, String last_name, String second_name, String phone_number, String email, ClientState clientState) {
        this.login = login;
        this.first_name = first_name;
        this.last_name = last_name;
        this.second_name = second_name;
        this.phone_number = phone_number;
        this.email = email;
        this.clientState = clientState;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return email;
    }

    public ClientState getClientState() {
        return clientState;
    }
}
