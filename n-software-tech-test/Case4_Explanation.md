# Case #4 — Explanation

## Client Request
“I am trying to print all product titles from this endpoint:  
https://dummyjson.com/products  
How can I do that using your components? Can you provide some demo code?”

## Requirements
1. Use any major programming language (I chose Java).
2. Use components or standard libraries to access the endpoint.
3. Parse the JSON response and print each product's title.

## My Approach
1. Access the URL using Java's `HttpURLConnection`.
2. Read the entire JSON response as a String.
3. Use the `org.json` library to parse the response.
4. Extract each product from the `products` array.
5. Loop through each object and print the `title` field.

## Why Java
- It is officially supported by the company.
- I have prior experience with Java.
- It allows easy JSON handling using available libraries.

## Notes
- The JSON structure has a `products` key that contains an array.
- Each object in that array has a `title` field.
- This solution uses standard Java classes and `org.json` library.

Let me know if you'd prefer this implemented in another language.
