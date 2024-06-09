The Screen Time Tracker App is designed to help users log and manage their daily screen time activities. This simple and intuitive Android application allows users to enter and store the time they spend on various tasks throughout the day, with a specific focus on morning and afternoon activities. Users can also add notes related to their activities, view detailed logs of their screen time, and clear all entries if needed. The application is built using Kotlin and follows a clean and user-friendly design.

Features
Splash Screen: Upon launching the app, users are greeted with a splash screen displaying the app name "Scores", providing a visually appealing introduction before navigating to the main activity.

Main Activity: The main activity of the app includes the following features:

Day Input: An EditText field for users to enter the day.
Morning Tasks Input: An EditText field to log the morning screen time activities, allowing both numeric and textual entries.
Afternoon Tasks Input: An EditText field to log the afternoon screen time activities, allowing both numeric and textual entries.
Activity Notes: An EditText field for adding notes about the activities.
Add Button: A button to save the entered screen time data.
View Details Button: A button to view detailed logs of the saved screen time entries.
Clear Button: A button to clear all the stored screen time entries.
Detailed View Activity: This activity displays the detailed logs of the screen time entries. Users can view all the saved data and navigate back to the main activity using the back button.

Implementation
MainActivity.kt
The MainActivity class handles the main screen functionality. 
It allows users to input the day, morning tasks, afternoon tasks, and notes. The data is stored in a mutable list of triples, representing the day, morning tasks, and afternoon tasks. The btnAdd button validates and adds the data to the list, while the btnViewDetails button navigates to the DetailedViewActivity to display the saved entries. The btnClear button clears all entries from the list.

DetailedViewActivity.kt
The DetailedViewActivity class is responsible for displaying the detailed view of the screen time entries. It retrieves the list of saved data passed from the MainActivity and presents it in a user-friendly format. A back button is included to allow users to return to the main activity.

activity_main.xml
The layout file for the main activity defines the user interface elements, including EditText fields for input and Button elements for actions. The ConstraintLayout is used to create a responsive and organized layout.
The Screen Time Tracker App is a straightforward and effective tool for tracking daily screen time. Its clean interface and easy-to-use features make it suitable for users of all ages who want to monitor and manage their screen time effectively. The app's architecture ensures that it is easily extensible for future enhancements and additional features.
