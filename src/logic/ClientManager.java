/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import entities.Client;
import exceptions.PasswordDontMatch;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.core.GenericType;
import restful.ClientRestFul;

/**
 *
 * @author Usuario
 */
public class ClientManager implements ClientInterface{
    ClientRestFul clienRestFul = new ClientRestFul();

    @Override
    public void edit(Client client)throws ClientErrorException {
        clienRestFul.edit(client, String.valueOf(client.getId()));
    }

    @Override
    public Client find(String id) throws ClientErrorException {
        Client client=clienRestFul.find(new GenericType<Client>(){}, id);
        return client;
    }

    @Override
    public <T> T findRange(Class<T> responseType, String from, String to) throws ClientErrorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T findAll(Class<T> responseType) throws ClientErrorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String id) throws ClientErrorException {
        clienRestFul.remove(id);
    }

    

    @Override
    public void create(Client client) throws ClientErrorException {
        clienRestFul.create(client);
    }

    @Override
    public Client findClientByFullName(String fullName) throws ClientErrorException {
        Client client=clienRestFul.findClientByFullName(new GenericType<Client>(){}, fullName);
        return client;
    }
    
}
