create table Pilot(
    PilotNum int,
    PilotName VARCHAR(20) not null,
    Grade int,
    Age int,

    Constraint pk_pilot primary key(PilotNum)
);

create table AirCraft(
    AircraftNum int not null,
    AircraftName VARCHAR(30) not null,
    AricraftType VARCHAR(15) not null
);


create table Flight(
    PilotNum int not null,
    AircraftNum int not null,
    FlightDate DATETIME,

    constraint pk_Flight primary key(PilotNum, AircraftNum),
    constraint fk_Flight_Pilot foreign key(PilotNum) references Pilot(PilotNum),
    constraint fk_Flight_Aircraft foreign key(AircraftNum) references Aircraft(AircraftNum)

);

INSERT INTO Pilot
VALUES(13, '홍길동', 1, 44);

INSERT INTO Pilot
VALUES(32, '이순신', 10, 40);

INSERT INTO Pilot
VALUES(44, '안중근', 7, 32);

INSERT INTO AirCraft
VALUES(101, '에놀라게이', '폭격기');

INSERT INTO AirCraft
VALUES(102, '톰캣', '전투기');

INSERT INTO AirCraft
VALUES(103, '블랙버드', '정찰기');

INSERT INTO Flight
VALUES(13, 101, '2022-10-09');

INSERT INTO Flight
VALUES(44, 102, '2022-11-23');

select *from Pilot;

select *from AirCraft;

select *from Flight;

select PilotName
from Flight right JOIN Pilot on Flight.PilotNum = Pilot.PilotNum
where Flight.PilotNum is null;

select PilotName
from Pilot left join flight on Pilot.PilotNum = flight.PilotNum
where Flight.PilotNum is null;


select *
from Pilot inner join Flight on Pilot.PilotNum = Flight.PilotNum;
