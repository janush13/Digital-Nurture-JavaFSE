import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class MyServiceTest {


    @Test
    public void testExternalApi() {


        // Arrange: Create Mock Object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);


        // Stub method behavior
        when(mockApi.getData())
                .thenReturn("Mock Data");


        // Pass mock object to service
        MyService service = new MyService(mockApi);



        // Act: Call method
        String result = service.fetchData();



        // Assert: Verify output
        assertEquals("Mock Data", result);


    }

}