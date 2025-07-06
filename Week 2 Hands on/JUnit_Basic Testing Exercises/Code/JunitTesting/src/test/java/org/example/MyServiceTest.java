package org.example;

import static org.mockito.Mockito.*;
import org.junit.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock object of ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Create the service instance using the mock
        MyService service = new MyService(mockApi);

        // Step 3: Call the method that should interact with the mock
        service.fetchData();

        // Step 4: Verify that the method getData() was called on the mock
        verify(mockApi).getData();
    }
}
