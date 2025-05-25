-- Exercise 1: User Upcoming Events
-- Show a list of all upcoming events a user is registered for in their city, sorted by date.
SELECT 
    e.event_id, 
    e.title, 
    e.start_date
FROM Registrations r
JOIN Users u ON r.user_id = u.user_id
JOIN Events e ON r.event_id = e.event_id
WHERE e.status = 'upcoming'
  AND u.city = e.city
  AND u.user_id = ?  -- Replace with a specific user ID parameter
ORDER BY e.start_date ASC;