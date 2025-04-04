The Flyweight Pattern was used to solve the problem of handling a large number of markers on the map, such as for gas stations, 
restaurants, and hospitals. These markers often share the same style, and without the pattern, each marker would create its own instance of the style, which increases memory usage. 
The Proxy Pattern solves the issue of loading high-resolution property images only when needed, reducing initial loading time and memory consumption by displaying low-resolution thumbnails until the user decides to zoom in.

Flyweight Pattern:
The Flyweight Pattern optimizes the design by storing common data (e.g., marker styles) in one place (in a Map),
 instead of duplicating them in each marker. This saves memory, as the same style can be shared across multiple markers, reducing the number of objects created.

Proxy Pattern:
The Proxy Pattern improves the system by introducing a proxy class that controls access to the real object. 
It loads high-resolution images only when the user decides to view them. This reduces memory and bandwidth usage, and enhances the user experience by providing faster loading times and loading content only when needed.







