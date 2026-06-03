SELECT u.full_name, e.title, e.start_date
FROM Users u
JOIN Registrations r ON u.user_id = r.user_id
JOIN Events e ON r.event_id = e.event_id
WHERE e.status = 'upcoming'
ORDER BY e.start_date;

SELECT e.title, AVG(f.rating) AS Avg_Rating
FROM Events e
JOIN Feedback f ON e.event_id = f.event_id
GROUP BY e.event_id, e.title
ORDER BY Avg_Rating DESC;


SELECT *
FROM Users
WHERE user_id NOT IN
(SELECT user_id FROM Registrations);


SELECT event_id, COUNT(*) AS Total_Sessions
FROM Sessions
WHERE HOUR(start_time) BETWEEN 10 AND 12
GROUP BY event_id;


SELECT city, COUNT(*) AS Total_Users
FROM Users
GROUP BY city
ORDER BY Total_Users DESC;


SELECT event_id, COUNT(*) AS Total_Resources
FROM Resources
GROUP BY event_id;


SELECT user_id, event_id, comments
FROM Feedback
WHERE rating < 3;


SELECT e.title, COUNT(s.session_id) AS Total_Sessions
FROM Events e
LEFT JOIN Sessions s
ON e.event_id = s.event_id
WHERE e.status = 'upcoming'
GROUP BY e.title;


SELECT organizer_id, status, COUNT(*) AS Total_Events
FROM Events
GROUP BY organizer_id, status;


SELECT title
FROM Events
WHERE event_id NOT IN
(SELECT event_id FROM Feedback);


SELECT registration_date, COUNT(*) AS Total_Users
FROM Users
GROUP BY registration_date;


SELECT event_id, COUNT(*) AS Total_Sessions
FROM Sessions
GROUP BY event_id
ORDER BY Total_Sessions DESC;


SELECT e.city, AVG(f.rating) AS Avg_Rating
FROM Events e
JOIN Feedback f
ON e.event_id = f.event_id
GROUP BY e.city;


SELECT event_id, COUNT(*) AS Registrations
FROM Registrations
GROUP BY event_id
ORDER BY Registrations DESC
LIMIT 3;


SELECT s1.event_id
FROM Sessions s1
JOIN Sessions s2
ON s1.event_id = s2.event_id
AND s1.session_id <> s2.session_id;


SELECT *
FROM Users
WHERE user_id NOT IN
(SELECT user_id FROM Registrations);


SELECT speaker_name, COUNT(*) AS Session_Count
FROM Sessions
GROUP BY speaker_name
HAVING COUNT(*) > 1;


SELECT title
FROM Events
WHERE event_id NOT IN
(SELECT event_id FROM Resources);


SELECT e.title, AVG(f.rating) AS Avg_Rating
FROM Events e
JOIN Feedback f
ON e.event_id = f.event_id
WHERE e.status = 'completed'
GROUP BY e.title;


SELECT user_id, COUNT(event_id) AS Events_Attended
FROM Registrations
GROUP BY user_id;


SELECT user_id, COUNT(*) AS Feedback_Count
FROM Feedback
GROUP BY user_id
ORDER BY Feedback_Count DESC
LIMIT 5;


SELECT user_id, event_id, COUNT(*) AS Duplicate_Count
FROM Registrations
GROUP BY user_id, event_id
HAVING COUNT(*) > 1;


SELECT MONTH(registration_date) AS Month,
COUNT(*) AS Registrations
FROM Registrations
GROUP BY MONTH(registration_date);


SELECT event_id,
AVG(TIMESTAMPDIFF(MINUTE,start_time,end_time)) AS Avg_Duration
FROM Sessions
GROUP BY event_id;


SELECT title
FROM Events
WHERE event_id NOT IN
(SELECT event_id FROM Sessions);