<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta
      name="description"
      content="My online portfolio that illustrates skills acquired while working through various project requirements."
    />
    <meta name="author" content="Amanda Leon" />
    <link rel="icon" href="amanda.ico" />

    <title>Amanda Leon's Online Portfolio</title>

    <%@ include file="/css/include_css.jsp" %>

    <!-- Carousel styles -->
    <style type="text/css">
      h2 {
        margin: 0;
        color: #733635;
        padding-top: 50px;
        font-size: 52px;
        font-family: "trebuchet ms", sans-serif;
      }
      .item {
        background: #ffd700;
        text-align: center;
        height: 300px !important;
      }
      .carousel {
        margin: 20px 0px 20px 0px;
      }
      .bs-example {
        margin: 20px;
      }
    </style>
  </head>
  <body>
    <%@ include file="/global/nav_global.jsp" %>

    <div class="container">
      <div class="starter-template">
        <div class="page-header"><%@ include file="/global/header.jsp" %></div>

        <!-- Start Bootstrap Carousel  -->
        <div class="bs-example">
          <div
            id="myCarousel"
            class="carousel"
            data-interval="1000"
            data-pause="hover"
            data-wrap="true"
            data-keyboard="true"
            data-ride="carousel"
          >
            <!-- Carousel indicators -->
            <ol class="carousel-indicators">
              <li
                data-target="#myCarousel"
                data-slide-to="0"
                class="active"
              ></li>
              <li data-target="#myCarousel" data-slide-to="1"></li>
              <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
            <!-- Carousel items -->
            <div class="carousel-inner">
              <div
                class="active item"
                style="
                  background: url(img/linkedin.png) no-repeat left center;
                  background-size: cover;
                "
              >
                <div class="container">
                  <div class="carousel-caption">
                    <h3>My LinkedIn</h3>

                    <a
                      class="btn btn-large btn-primary"
                      href="https://www.linkedin.com/in/amanda-leon-532280150/"
                      >Learn more</a
                    >
                  </div>
                </div>
              </div>

              <div
                class="item"
                style="
                  background: url(img/fsu.jpg) no-repeat left center;
                  background-size: cover;
                "
              >
                <div class="carousel-caption">
                  <h3>
                    Bachelors in Information Technology & Minor in Computer
                    Science
                  </h3>
                  <p>Expected in Fall 2025</p>
                  <!--  <img src="img/slide2.png" alt="Slide 2">									 -->
                </div>
              </div>

              <div
                class="item"
                style="
                  background: url(img/bitbucket.png) no-repeat left center;
                  background-size: cover;
                "
              >
                <div class="carousel-caption">
                  <h3>My Bitbucket Account</h3>
                  <a
                    class="btn btn-large btn-primary"
                    href="https://bitbucket.org/aamandaleon/lis4368/src/main/"
                    >Learn more</a
                  >
                  <!--  <img src="img/slide3.png" class="img-responsive" alt="Slide 3">							 -->
                </div>
              </div>
            </div>
            <!-- Carousel nav -->
            <a
              class="carousel-control left"
              href="#myCarousel"
              data-slide="prev"
            >
              <span class="glyphicon glyphicon-chevron-left"></span>
            </a>
            <a
              class="carousel-control right"
              href="#myCarousel"
              data-slide="next"
            >
              <span class="glyphicon glyphicon-chevron-right"></span>
            </a>
          </div>
        </div>
        <!-- End Bootstrap Carousel  -->

        <%@ include file="/global/footer.jsp" %>
      </div>
      <!-- end starter-template -->
    </div>
    <!-- end container -->

    <%@ include file="/js/include_js.jsp" %>
  </body>
</html>
