package io.github.jx2lee.getting.started.with.java.private_interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class ClientImplTest {
    @Test
    @DisplayName("interface 내 private method 구현이 가능하다")
    void privateMethodInInterface() {
        ClientImpl client = mock(ClientImpl.class);
        doNothing().when(client).get();

        client.get();

        verify(client, times(1)).get();
        Assertions.assertInstanceOf(Client.class, client);
    }
}
