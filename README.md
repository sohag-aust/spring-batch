-> Spring Batch is a lightweight batch framework which can be used by enterprise sysetms to develop robust batch applications for the daily operations. 

-> Consider an environment where users have to do a lot of batch processing. This will be quite different from a typical web application which has to work 24/7.

-> But in classic environments it's not unusual to do the heavy lifting for example during the night when there are no regular users using a system. Batch processing includes typical tasks like: reading and writing to files, transforming data, reading from or writing to databases, create reports, import and export data and things like that.

-> Often these steps have to be chained together or have to create more complex workflows where to define which job steps can be run parallel or have to be run sequentially etc. That's where a framework like Spring Batch can be handy.

-> Spring Boot Batch provides reusable functions that are essential in processing large volumes of records, including loggin/tracing, transaction management, job processing statistics, job restart, skip, and resource management. It also provides more advanced technical services and features that will enable extremely high-volume and high performance batch jobs though optimization and partitioning techniques. Simple as well as complex, high-volume batch jobs can leverage the framework in a highly sccalable manner to process significant volumes of information.


-> Jobs: Spring batch follows the traditional batch architecture where a job repository does the work of scheduling and interacting with the job. A job can have more than one steps – and every step typically follows the sequence of reading data, processing it and writing it.

-> Chunk: Spring Batch uses a 'Chunk-oriented' processing style within its most common implementation. Chunk oriented processing refers to reading the data one at a time and creating 'chunks' that are written out within a transaction boundary. One item is read in from an ItemReader , handed to an ItemProcessor , and aggregated.
