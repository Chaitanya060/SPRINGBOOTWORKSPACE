<!DOCTYPE html>
<html>
<head>
    <link type="text/css" rel="stylesheet" href="css/style.css">
    <style>
        /* Add CSS styles for the cards */
        .card {
            border: 1px solid #ccc;
            padding: 20px;
            margin: 10px;
            width: 200px;
            display: inline-block;
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
            background-color: #fff;
        }

        /* Style for the container div */
        .container {
            text-align: center;
        }

        /* Style for the "Total Employees" card */
        .employee-card {
            background-color: #66b3ff; /* Blue color */
        }

        /* Style for the "Total Customers" card */
        .customer-card {
            background-color: #ff6666; /* Red color */
        }
    </style>
</head>
<body>
    <div class="container">
        <%@ include file="adminnavbar.jsp" %>
        
        <!-- Create separate cards for employees and customers with different colors -->
        <div class="card employee-card">
            <h2>Total Employees</h2>
            <p>${ecount}</p>
        </div>

        <div class="card customer-card">
            <h2>Total Customers</h2>
            <p>${ccount}</p>
        </div>
    </div>
</body>
</html>
