document.addEventListener('DOMContentLoaded', function () {
    var commentButton = document.querySelector('.btn-outline-light.btn-lg.px-4');
    var footer = document.querySelector('footer');

    commentButton.addEventListener('click', function () {
        var scrollStep = -window.scrollY / (1000 / 15);
        var scrollInterval = setInterval(function () {
            if (window.scrollY !== 0) {
                window.scrollBy(0, scrollStep);
            } else {
                clearInterval(scrollInterval);
            }
        }, 15);
        footer.scrollIntoView();
    });
});

document.getElementById('postCommentBtn').addEventListener('click', function () {
    // Get the comment text
    const commentText = document.getElementById('commentText').value;

    // Create new comment card
    const newComment = document.createElement('div');
    newComment.className = 'col-lg-6 comment-card';
    newComment.innerHTML = `
      <div class="card mb-4">
        <div class="card-body p-4">
          <div class="d-flex">
            <div class="flex-shrink-0"><i class="bi bi-chat-right-quote-fill text-primary fs-1"></i></div>
            <div class="ms-4">
              <p class="mb-1">${commentText}</p>
              <div class="small text-muted commented-user">Nhân</div>
            </div>
          </div>
        </div>
      </div>`;

    // Append the new comment to the comment list
    document.getElementById('commentList').appendChild(newComment);

    // Clear the textarea
    document.getElementById('commentText').value = '';
});