/*
 * Created by IntelliJ IDEA.
 * Package Name: org.anvaya.core.request
 * User: Andrei Gache.
 * Email: andrei.gache.99@gmail.com
 * Website: https://andrei-gache.com
 * Date: 10/04/20
 * Time: 13:18
 */
package org.anvaya.core.request;

import org.anvaya.core.common.AnvayaEndpoint;

public final class AuthRequest extends AbstractRequest{
    public AuthRequest() {
        super.uri = AnvayaEndpoint.AUTH;
    }
}
