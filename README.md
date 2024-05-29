# Bus Depot Management System

## Description
This project is a high-fidelity prototype of a web-based system for managing bus depots and their buses, using JSPs for view technology and Spring MVC for handling requests. The system includes domain classes for Bus and Depot, controllers for various operations, and validation for data integrity. It features user-friendly forms and views for managing depots and buses, ensuring ease of use and efficient management.

## Key Features
- **Configuration**: Supports JSPs placed in `src/main/webapp/WEB-INF/views/`.
- **Domain Classes**: Includes `Bus` and `Depot` classes with appropriate fields and methods.
- **Controllers**: Handles requests for main, depot, and bus operations with corresponding views.
- **Forms and Views**: Provides JSP forms for adding depots and buses with validation.
- **Validation**: Ensures unique depot IDs, non-empty fields, and valid bus details.

## Detailed File Descriptions

### Java Classes
1. **BusController.java**: 
   - Handles operations related to buses, such as adding and listing buses.
2. **DepotController.java**: 
   - Manages depot-related activities, including adding and listing depots.
3. **MainController.java**: 
   - Manages the main application routes, such as the home page.

### Configuration Files
1. **application.properties**: 
   - Contains configuration settings for the application.

### JSP Files
1. **start.jsp**: 
   - The main page of the application, serving as the homepage or landing page.
2. **form.jsp**: 
   - The form for adding new depots or buses, with input validation.
3. **list.jsp**: 
   - Lists all depots or buses, with options to view more details or add new entries.

### HTML Files
1. **tasks.html**: 
   - Provides a detailed description of the tasks and requirements for the project.

## Installation and Usage
1. **Clone the repository**:
   ```sh
   git clone https://github.com/osman789g/bus-depot-management-system.git

2. **Navigate to the project directory:**:
   ```sh
   cd bus-depot-management-system

3. **Build and run the application:**
 - Use your preferred Java IDE or build tool to compile and run the application.
 - Ensure your environment is configured to support JSPs and Spring MVC.

4. **Access the appication:**
 - Open a web browser and navigate to http://localhost:8080 to view the application.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License
This project is licensed under the MIT License.

## Contact
For any inquiries or feedback, please contact [osman.temirkhanov@gmail.com].

