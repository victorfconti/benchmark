# Multi-language Benchmark 
*A project to compare multiples framework of multiples languages to see they strong and weak points, and have a guide where to use.* 

## :smiley: Why
Today we have a lot of language and frameworks for web development, and each of them has their
advantage and downside, for that, will be created tree project for each of these frameworks, one with a strong CPU used, one with strong IO with JSON, and another with strong IO from videos.

So this project will compare the following languages with the related frameworks:

- Java
  - Spring Web
  - Spring Webflux
  - Micronaut
  - Micronaut Reactive Reactor
  - Micronaut Reactive RxJava 3
  - Vert.x
  - Quarkus
  - Quarkus Reactive
- Javascript
  - Express
  - Next.js
  - Fastify 
  - Restify
  
From those languages will be collected the following data
- Startup time
- Memory used
- Processor use
- Lines of code
- Readability of code

## :bulb: Methodology
 Will be used three projects for each framework, were some key point will
 be compared. 
 One will be a project to stream a video, that will equal for all.
 The other will be a project that will return a medium text from each request.
 The last will be a project that realizes a strong calculation, that will be defined in the future.
 From each one, will be realized 1.000 requests, and the resource used will be used to generate the result.
 To collect those data probably will be used *Prometheus*.
 
## :pencil2: Roadmap
- :x: Project to summarize the results.  
- :heavy_check_mark: Projects with Spring web
- :heavy_check_mark: Projects with Spring webflux
- :x: Projects with Micronaut
- :x: Projects with Micronaut reactive reactor
- :x: Projects with Micronaut reactive rxJava 3
- :x: Projects with Vert.x
- :x: Projects with quarkus
- :x: Projects with Quarkus Reactive Vert.x
- :x: Projects with Express
- :x: Projects with Next.js
- :x: Projects with Fastify 

## :bar_chart: Results
Yet not have any

## :calendar: Future works
Here are some recommendation for future works
- Compare the number of data that can be consumed from Rabbit of each os these 
frameworks and pure language.
- Add database connections
- Adition of reactive Node
- Adition of Deno
