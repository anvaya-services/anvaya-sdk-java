/*
 * Created by IntelliJ IDEA.
 * Package Name: org.anvaya.core.client
 * User: Andrei Gache.
 * Email: andrei.gache.99@gmail.com
 * Website: https://andrei-gache.com
 * Date: 10/04/20
 * Time: 13:01
 */
package org.anvaya.core.client;

import org.anvaya.core.response.Response;

public abstract class AbstractClient implements Client{

    public Response auth() {
        return null;
    }

    public Response asyncAuth() {
        return null;
    }

    public Response go() {
        return null;
    }

    public Response asyncGo() {
        return null;
    }
}
