# 📒 Note App – Spring Boot CRUD Example

This is a simple Java application demonstrating basic CRUD functionality using Spring Boot and Java Collections. The app manages a single entity: `Note`.  
It includes a service layer and in-memory storage using a `HashMap`

## Implemented Features

### ✅ Entity
**Note**  
- `id` (Long, auto-generated)  
- `title` (String)  
- `content` (String)  

### ✅ Service Layer
Encapsulates business logic using a Spring `@Service` component.  
Provides full CRUD operations:

- Create (`add`)
- Read (`getById`, `listAll`)
- Update (`update`)
- Delete (`deleteById`)

The service uses a `HashMap<Long, Note>` to simulate database behavior, with `AtomicLong` for unique ID generation.
