package contracts.contractdemoserver

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("""
Represents a successful scenario of getting a response from the /test endpoint.

```
given:
	nothing
when:
	a request for a Test is made
then:
	returns a test object with id 1001 and no cards
```

""")
    request {
        method 'GET'
        url '/test'
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 200
        body("""
            {
                "id":1001,
                "cards":[]
            }
        """)
        headers {
            contentType(applicationJson())
        }
    }
}