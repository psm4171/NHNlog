<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" session="false" %>

<div style="margin: auto; width: 400px;">
    <div class="p-2">
        <form method="post" action="/productEnroll.do">

            <h1 class="h3 mb-3 fw-normal">Enroll Product</h1>

            <div class="form-floating">
                <input type="text" name="ProductID" class="form-control" id="ProductID" placeholder="상품 아이디" required>
                <label for="ProductID">Product ID</label>
            </div>

            <div class="form-floating">
                <input type="password" name="CategoryID" class="form-control" id="CategoryID" placeholder="카테고리 아이디" required>
                <label for="CategoryID">Category ID</label>
            </div>

            <div class="form-floating">
                <input type="text" name="Model Number" class="form-control" id="ModelNumber" placeholder="모델 번호" required>
                <label for="ModelNumber">Model Numer</label>
            </div>

            <div class="form-floating">
                <input type="text" name="Model Name" class="form-control" id="ModelName" placeholder="모델 이름" required>
                <label for="ModelName">Model Name</label>
            </div>

            <div class="form-floating">
                <input type="text" name="ProductImage" class="form-control" id="ProductImage" placeholder="상품 이미지" required>
                <label for="ProductImage">Product Image</label>
            </div>

            <div class="form-floating">
                <input type="text" name="Description" class="form-control" id="Description" placeholder="상품 특징" required>
                <label for="Description">상품 특징</label>
            </div>

            <button class="w-100 btn btn-lg btn-primary mt-3" type="submit">Enroll</button>

            <p class="mt-5 mb-3 text-muted">© 2022-2024</p>

        </form>
    </div>
</div>
